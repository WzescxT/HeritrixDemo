import org.archive.crawler.postprocessor.*;
import org.archive.modules.CrawlURI;

public class MyReschedulingProcessor extends ReschedulingProcessor {

    public MyReschedulingProcessor(){
        super();
    }

    @Override
    protected boolean shouldProcess(CrawlURI curi) {
        System.out.println("ReschedulingProcessor");
        return super.shouldProcess(curi);
    }
}
