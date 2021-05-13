public class projectsTester {
    public static void main(String[] args){
        projects newPrinter = new projects(); // create a project with no inputs.
        projects RocheFillStation = new projects("UV Curing Agent"); // create a project with one input.
        projects PMBSCube = new projects("MTS-225","Product for sanitizing surgical tools"); // create a project with two inputs.
        
        // test 'setter' functionality by adding name and desc to newPrinter.
        System.out.println("");
        newPrinter.setName("Prusa i3");
        newPrinter.setDesc("FDM-3D printer with bed leveling and crash detection features.");
        System.out.println("Test .getName() method :"+newPrinter.getName());
        System.out.println("Test .getDesc() method :"+newPrinter.getDesc());
        System.out.println(newPrinter.elevatorPitch());
        System.out.println("");
        RocheFillStation.setDesc("welding of two reservoirs for cancer diagnostics kit.");
        System.out.println(RocheFillStation.elevatorPitch());
        System.out.println("");
        System.out.println(PMBSCube.elevatorPitch());
        System.out.println("");
    }
}
