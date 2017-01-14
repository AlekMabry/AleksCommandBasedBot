# AleksCommandBasedBot

This is the java code for my FRC bot. This code uses a command-based format as opposed to the iterative of my current robot code.

I included the robotBuilder .YAML file so you can edit the structure, but here is a text version with description:

Subsystems:
  DriveTrain:             //Main subsystem that everything is based on
    DriveBase:            //This is a two-wheeled robotDrive subsystem thing
      leftCIM             //Victor 888 motor driver connected to pin 0
      rightCIM            //Victor 888 motor driver connected to pin 1
  UDP                     //A subsystem to hold the UDP socket data
  
Operator interface:
  LogitechJoystick        //A joystick connected to port 0, I used the 1 & 2 axis's to control the robot's speed/rotation
  
Commands:
  driveBot                //Some arcade drive code. Requires DriveTrain.
  AutonomousCommand       //The default auto command. I haven't put anything in it yet.
  turnDegrees             //Turns the robot a specific amount of degrees (based on UDP.inputValue variable).
  receiveUDP              //Code that waits for a UDP message and then updates UDP.inputValue and returns a message.
  receivePacketAndTurn    //A command group that just runs: receiveUDP --> turnDegrees. It is the default for DriveTrain.
  
I can't figure out how to get the receiveUDP command to call the turnDegrees command and run in parallel. Also the automous code is actually in teleop. I'll try to fix it tommorow if I have time. 
