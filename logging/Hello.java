import java.util.logging.Logger;
import java.util.logging.LogManager;

final Logger log = Logger.getLogger("scripted");

void main(String[] args) throws IOException {
    try(InputStream inputStream = new FileInputStream("logging.properties")) {
        LogManager.getLogManager().readConfiguration(inputStream);
    }
    log.info("saying hello to %s".formatted(args[0]));
    IO.println("hello %s".formatted(args[0]));
}
