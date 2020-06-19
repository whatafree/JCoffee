import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c8688357 {
public MyHelperClass IOUtils;
public MyHelperClass dynusTDir;
	public MyHelperClass modelDir;
	public MyHelperClass ExeRunner;
	public MyHelperClass log;
	public MyHelperClass tmpDir;

    public void runDynusT() {
        final String[] exeFiles = new String[] { "DynusT.exe", "DLL_ramp.dll", "Ramp_Meter_Fixed_CDLL.dll", "Ramp_Meter_Feedback_CDLL.dll", "Ramp_Meter_Feedback_FDLL.dll", "libifcoremd.dll", "libmmd.dll", "Ramp_Meter_Fixed_FDLL.dll", "libiomp5md.dll" };
        final String[] modelFiles = new String[] { "network.dat", "scenario.dat", "control.dat", "ramp.dat", "incident.dat", "movement.dat", "vms.dat", "origin.dat", "destination.dat", "StopCap4Way.dat", "StopCap2Way.dat", "YieldCap.dat", "WorkZone.dat", "GradeLengthPCE.dat", "leftcap.dat", "system.dat", "output_option.dat", "bg_demand_adjust.dat", "xy.dat", "TrafficFlowModel.dat", "parameter.dat" };
        MyHelperClass log = new MyHelperClass();
        log.info("Creating iteration-directory...");
        File iterDir = new File((String)(Object)this.tmpDir);
        if (!iterDir.exists()) {
            iterDir.mkdir();
        }
        log.info("Copying application files to iteration-directory...");
        for (String filename : exeFiles) {
            log.info("  Copying " + filename);
            IOUtils.copyFile(new File(this.dynusTDir + "/" + filename), new File(this.tmpDir + "/" + filename));
        }
        log.info("Copying model files to iteration-directory...");
        for (String filename : modelFiles) {
            log.info("  Copying " + filename);
            IOUtils.copyFile(new File(this.modelDir + "/" + filename), new File(this.tmpDir + "/" + filename));
        }
        String logfileName = this.tmpDir + "/dynus-t.log";
        String cmd = this.tmpDir + "/DynusT.exe";
        log.info("running command: " + cmd);
        int timeout = 14400;
        int exitcode =(int)(Object) ExeRunner.run(cmd, logfileName, timeout);
        if (exitcode != 0) {
            throw new RuntimeException("There was a problem running Dynus-T. exit code: " + exitcode);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass run(String o0, String o1, int o2){ return null; }}
