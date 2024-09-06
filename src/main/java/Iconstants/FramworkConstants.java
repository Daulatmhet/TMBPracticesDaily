package Iconstants;

public class FramworkConstants {
	
	
	private FramworkConstants()
	{
		
	}
	    private static final String  RESOURCEPATH= System.getProperty("user.dir")+"/src/test/resources";
		private static final String CONFIGPATH = RESOURCEPATH+"/config.prop";
		
		public static String getConfigFilepath() {
			return CONFIGPATH;
		}
		
		
		
	
	
}
