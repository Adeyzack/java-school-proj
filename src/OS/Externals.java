package OS;


//A place for our constants, macros, and helper functions
public class Externals {
//Wrong command-line arguments supplied.
//Prints error message and exits.
public static void invalidUsageExit() {
System.err.println("USAGE: java Main { first | best | next | worst } { first | best | next | worst }");
System.exit(1);
}
//Simulator ran out of memory.
//Prints error message and exits.
public static void outOfMemoryExit() {
System.err.println("OUT OF MEMORY");
System.err.println("Exiting from simulation");
System.exit(1);
}
public static void endOfSimulation() {
System.err.println("end of simulation.");
System.exit(1);
}
}
