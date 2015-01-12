package edu.fit.icis;

/**
 * Created by teskridge on 1/12/15.
 */
public class Router
{
    public static Router getInstance()
    {
        return new Router();
    }

    public Router()
    {
        System.out.println("Started a router");
    }
}
