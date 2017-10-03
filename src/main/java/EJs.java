import org.archive.modules.CrawlURI;
import org.archive.modules.extractor.Extractor;
import org.archive.modules.extractor.ExtractorJS;

public class EJs extends ExtractorJS {
    public EJs(){
        super();
    }

    @Override
    protected boolean considerString(Extractor ext, CrawlURI curi, boolean handlingJSFile, String candidate) {
        return super.considerString(ext, curi, handlingJSFile, candidate);
    }

    @Override
    protected boolean innerExtract(CrawlURI curi) {
        return super.innerExtract(curi);
    }

    @Override
    protected boolean shouldExtract(CrawlURI uri) {
        return super.shouldExtract(uri);
    }
}
