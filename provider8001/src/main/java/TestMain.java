import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName : TestMain  //类名
 * @Description : TODO  //描述
 * @Author : 8470
 * @Date: 2020-04-18 18:14
 */
public class TestMain {

    public static void main(String[] args){
        AtomicInteger nextServerCyclicCounter = new AtomicInteger(0);
        int modulo = 3;
        for (int i=0; i<20; i++) {
            int current = nextServerCyclicCounter.get();
            int next = (current + 1) % modulo;
            if (nextServerCyclicCounter.compareAndSet(current, next))
                System.out.println("输出的结果为:"+next);
        }

        List<String> teamList = new ArrayList<>();
        teamList.add("1");
        teamList.add("2");
        teamList.add("3");
        teamList.add("4");
        teamList.add("5");
        for(String index:teamList){
            if(index.equals("3")){
                teamList.remove(index);
            }
        }
    }
}
