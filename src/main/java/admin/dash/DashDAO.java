package admin.dash;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DashDAO {
    @Autowired
    private SqlSession mybatis;

    public List<DashChartDTO> pathList(){
        return mybatis.selectList("dash.pathList");
    }
}
