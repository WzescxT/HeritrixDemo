import org.archive.crawler.postprocessor.CandidatesProcessor;
import org.archive.modules.CrawlURI;

public class MyCandidatesProcessor extends CandidatesProcessor {

    public MyCandidatesProcessor(){
        super();
    }

    @Override
    protected boolean shouldProcess(CrawlURI puri) {
        System.out.println("CandidatesProcessor");
        //return super.shouldProcess(puri);
        return puri.getURI().startsWith("http://www.sse.com.cn");
    }
}
