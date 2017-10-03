import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.archive.modules.CrawlURI;
import org.archive.modules.extractor.ExtractorHTML;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EHtml extends ExtractorHTML {
    public EHtml(){
        super();
    }

    @Override
    protected boolean shouldExtract(CrawlURI uri) {
        if(uri.getURI().contains("http://www.sse.com.cn/js/common/ssesuggestdata.js;")){
            try {
               printCommpany(uri.getURI());
            } catch (IOException e) {
                System.out.println("Error");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }else{
            System.out.println("WAIT---------------------------------" + uri.getURI());
        }
        return true;
    }

    public static void printCommpany(String url) throws Exception{
        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);
        client.executeMethod(method);
        byte[] responseBody;
        responseBody = method.getResponseBodyAsString().getBytes(method.getResponseCharSet());
        Matcher m = Pattern.compile("val2:\"(.*?)\",val3").matcher(new String(responseBody, "utf-8"));
        while(m.find()) {
            System.out.println(m.group(1));
        }
        method.releaseConnection();
    }
}
