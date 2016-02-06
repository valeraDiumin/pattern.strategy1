package abstr_interf_Strategy;

/**
 * Created by Administrator on 2/1/16.
 */
public class SubInterface implements Interface1 {
    @Override
    public String hello() {
    return "Hello world! I am from SubInterface";
    }
    public int getInt(){
        return 6;
    }
}
