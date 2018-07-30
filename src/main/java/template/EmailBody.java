package template;

/**
 * 邮件正文
 * @Author 小代[821531843@qq.com]
 * @Date 2018/7/27 13:23
 */
public class EmailBody {

    public static String body(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello word");
        return stringBuffer.toString();
    }

}
