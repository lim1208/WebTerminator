//package edu.scut.ibm.test;
//
//import edu.scut.ibm.bean.Spittle;
//import edu.scut.ibm.controller.SpittleController;
//import edu.scut.ibm.dao.SpittleDao;
//import org.junit.Test;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.web.servlet.view.InternalResourceView;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import static org.hamcrest.CoreMatchers.hasItems;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
//import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
//
///**
// * Created by limin on 2017/7/8.
// */
//
//public class SpittleControllerTest {
//    @Test
//    public void shouldShowRecentSpittles(){
//        List<Spittle> expectedSpittles = createSpittles(20);
//        SpittleDao mockSpittleDao = mock(SpittleDao.class);
//        when(mockSpittleDao.findSpittles(Long.MAX_VALUE, 20)).thenReturn(expectedSpittles);
//
//        SpittleController controller = new SpittleController();
//        MockMvc mockMvc = standaloneSetup(controller)
//                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
//                .build();
//
//        mockMvc.perform(get("/spittles"))
//                .andExpect(view().name("spittles"))
//                .andExpect(model().attributeExists("spittleList"))
//                .andExpect(model().attribute("spittleList",
//                        hasItems(expectedSpittles.toArray())));
//    }
//
//    private List<Spittle> createSpittles(int count){
//        List<Spittle> spittles = new ArrayList<Spittle>();
//        for (int i = 0; i < count; i++) {
//            spittles.add(new Spittle("spittle" + i, new Date()));
//        }
//        return spittles;
//    }
//}
