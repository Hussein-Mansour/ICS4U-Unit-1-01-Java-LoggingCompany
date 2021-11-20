/*
 * The "LoggingCompany" program to prove some logs.
 *
 * @author  Hussein
 * @version 1.0
 * @since   2020-11-18
 */

import java.util.Scanner;

/**
 * This is the standard "LoggingCompany" program.
 */
final class LoggingCompany {
    /**
    * Density of logs, in Km/m.
    */
    public static final double DENSITY = 20.2;

    /**
    * Max truck load.
    */
    public static final double MAX_LOAD = 1100;

    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private LoggingCompany() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {

        // variables
        final double numberOfLogs;

        final Scanner myObj = new Scanner(System.in);
        // ask for user input
        System.out.print("Enter log lenght (0.25, 0.5 or 1): ");

        // Stores float in lenght
        final float lenght = myObj.nextFloat();

        // calculate number of logs
        numberOfLogs = (MAX_LOAD / lenght) / DENSITY;

        // how many logs the truck can carry
        System.out.println("The truck will be able to take "
            + numberOfLogs + " logs that are " + lenght
            + "meter(s) in lenght");

        // print out "Done."
        System.out.println("\nDone.");
    }

}
