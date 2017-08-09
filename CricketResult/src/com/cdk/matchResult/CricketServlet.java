package com.cdk.matchResult;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CricketServlet extends HttpServlet {

    ArrayList<CricketMatch> cricketMatches = new ArrayList<>();

    public void init() {
        CricketMatch match1 = new CricketMatch("India", "England","Test-Match", "Manhatten",345,45.5,"England");
        CricketMatch match2 = new CricketMatch("India", "Pakistan", "20-20", "Mumbai", 666,40,"India");
        CricketMatch match3 = new CricketMatch("Australia", "England", "WorldCup", "Spain", 564,20,"Australia");
        CricketMatch match4 = new CricketMatch("West Indies", "England", "20-20", "Africa",899,40,"West Indies");
        cricketMatches.add(match1);
        cricketMatches.add(match2);
        cricketMatches.add(match3);
        cricketMatches.add(match4);
    }

    public void destroy() {
        cricketMatches.clear();
        cricketMatches = null;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String matchType = request.getParameter("Type");
        String country1 = request.getParameter("c1");
        String country2 = request.getParameter("c2");

        PrintWriter pw = response.getWriter();
        pw.write("Helllo world");
        Iterator<CricketMatch> itr = cricketMatches.iterator();
        while (itr.hasNext()) {
            CricketMatch temp = itr.next();
            if (matchType.equals(temp.getMatchType())) {
                if (country1.equals(temp.getCountry1())) {
                    if (country2.equals(temp.getCountry2())) {

                        pw.write("Match result between countries:<br/>" + country1 +" V / S" + country2 + "<br/>" + temp.toString());
                        break;
                    }
                }
            }
        }


    }
}
