import org.archive.crawler.postprocessor.*;
import org.archive.modules.CrawlURI;

public class FrontierSchedulerForMe extends ReschedulingProcessor {

    public FrontierSchedulerForMe(){
        super();
    }

    @Override
    protected boolean shouldProcess(CrawlURI curi) {
        return super.shouldProcess(curi);
    }
}
