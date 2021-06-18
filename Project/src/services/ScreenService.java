package services;
import Screens.FileOptionsScreen;
import Screens.Screen;
import Screens.Welcome;
import Entities.Directory;


public class ScreenService {
	
	//static Directory dir = new Directory();
	
	
	
	public static Welcome Welcome = new Welcome();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
    
    

    public static Screen CurrentScreen = Welcome;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}