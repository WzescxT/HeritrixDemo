import org.archive.crawler.postprocessor.DispositionProcessor;
import org.archive.modules.CrawlURI;

public class MyDispositionProcessor extends DispositionProcessor {

    public MyDispositionProcessor(){
        super();
    }

    @Override
    protected boolean shouldProcess(CrawlURI puri) {
        System.out.println("DispositionProcessor");
        return super.shouldProcess(puri);
    }
}
