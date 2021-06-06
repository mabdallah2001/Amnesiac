package Objects;

public class ToothBrush extends MainStoryObjects {

	ToothBrush() {
		this.description = "This toothbrush seems familiar...";
		this.name = "toothbrush";
		
	}

	public void triggerEvent() throws InterruptedException {

		 System.out.println("			██████                                                                                      \r\n" + 
		 		"		  ██▒▒▒▒▒▒██████                                                                                \r\n" + 
		 		"		  ██▒▒▒▒▒▒▒▒▒▒▒▒██████                                                                          \r\n" + 
		 		"		    ████▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████                                              ██                    \r\n" + 
		 		"		        ██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒████████                                ██████  ██                  \r\n" + 
		 		"		              ██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████                        ██          ████    ██        \r\n" + 
		 		"		                    ██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████                ██  ████  ██      ████  ██      \r\n" + 
		 		"		                          ████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████          ██      ██  ██          ██      \r\n" + 
		 		"		                              ██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████    ██            ████    ████      \r\n" + 
		 		"		                                    ██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████                ████    ██    \r\n" + 
		 		"		                                          ██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██                        ██    \r\n" + 
		 		"		                                                ██████▒▒▒▒▒▒▒▒▒▒██                        ██    \r\n" + 
		 		"		                                                      ██████▒▒▒▒▒▒██████                  ██    \r\n" + 
		 		"		                                                            ██████▒▒▒▒▒▒██████            ██    \r\n" + 
		 		"		                                                                  ████▒▒▒▒▒▒▒▒██████      ████  \r\n" + 
		 		"		                                                                      ██████▒▒▒▒▒▒▒▒██████▒▒▒▒██\r\n" + 
		 		"		                                                                            ██████▒▒▒▒▒▒▒▒▒▒▒▒██\r\n" + 
		 		"		                                                                                  ████▒▒▒▒▒▒██  \r\n" + 
		 		"		                                                                                      ██████    ");

	}

	public void usage() throws InterruptedException {
		if (this.itemContext.state instanceof NotDiscovered) {
			System.out.println(this.toString());
			this.triggerEvent();
			this.itemContext.setStatus(new Discovered());
		} else
			System.out.println("You have already used the " + this.name);
	}

}
