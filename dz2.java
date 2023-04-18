//Создать метод, который запишет результат работы в файл Обработайте исключения и запишите ошибки в лог файл
import java.io.IOException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 
  
class Lagir { 
    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);   
    public void sampleLog() 
    { 
        LOGGER.log(Level.WARNING, "Such a mess"); 
    } 
}   
public class dz2 { 
    public static void main(String[] args) 
    { 
        Lagir obj = new Lagir(); 
        obj.sampleLog(); 
        LogManager slg = LogManager.getLogManager();        
        Logger log = slg.getLogger(Logger.GLOBAL_LOGGER_NAME);   
        log.log(Level.WARNING, "darkest hour is just yet to come"); 
    } 
} 
