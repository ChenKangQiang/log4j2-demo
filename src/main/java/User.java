import lombok.Data;
import lombok.extern.log4j.Log4j2;

/**
 * Created by chen on 2017/7/5.
 */

@Data
@Log4j2
public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public static void main(String[] args) {
        log.error("something wrong here");
    }
}
