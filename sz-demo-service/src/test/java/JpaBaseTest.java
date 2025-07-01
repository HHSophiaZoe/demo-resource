//import com.hit.coremodel.pagination.PageResModel;
//import com.hit.coremodel.pagination.PageableReqModel;
//import com.hit.coremodel.query.Filter;
//import com.hit.coremodel.query.Operator;
//import com.hit.movie.DemoApplication;
//import com.hit.movie.common.enums.VideoStatus;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@Slf4j
//@SpringBootTest(classes = DemoApplication.class)
//public class JpaBaseTest {
//
//    @Autowired
//    private VideoStore videoAdapter;
//
//    @Test
//    public void testCase1() {
//        Video video = new Video();
//        video.setStatus(VideoStatus.PROCESSED);
//        video.setInputPath("123");
//        videoAdapter.save(video);
//
//        PageableReqModel pageableReqModel = new PageableReqModel();
//        pageableReqModel.setPage(1);
//        pageableReqModel.setFilters(List.of(
//                new Filter(Operator.EQUAL.getValue(), "status", VideoStatus.PROCESSED.getValue()),
//                new Filter(Operator.EQUAL.getValue(), "inputPath", "123")
//
//        ));
//
//        long start2 = System.currentTimeMillis();
//        PageResModel<Video> search = videoAdapter.search(pageableReqModel);
//        log.info("search: {}", System.currentTimeMillis() - start2);
//
//        long test1 = System.currentTimeMillis();
//        videoAdapter.getAll();
//        log.info("test1: {}", System.currentTimeMillis() - test1);
//
//        long test2 = System.currentTimeMillis();
//        videoAdapter.getAllId();
//        log.info("test2: {}", System.currentTimeMillis() - test2);
//
//        videoAdapter.delete(video.getId());
//
//        Assertions.assertEquals(1, search.getItems().size());
//        Assertions.assertEquals(video.getId(), search.getItems().getFirst().getId());
//    }
//}
