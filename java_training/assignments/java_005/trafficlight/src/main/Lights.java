package main;

public enum Lights {
	RED("Light is Red - STOP!"), GREEN("Light is Green - GO!"), YELLOW("Light is Yellow - BEWARE!");
	
	public String command;
	
	Lights (String c)
	{
		
		command = c;
	}
	
	//Return String
	public String getCommand()
	{
		return command;
	}
	
	}

   


    