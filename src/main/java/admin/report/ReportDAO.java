package admin.report;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import admin.dash.ReportCountDTO;

@Repository
public class ReportDAO {
    @Autowired
    private SqlSession mybatis;

    public List<BoardDTO> boardList() {
        return mybatis.selectList("report.boardList");
    }

    public List<ReportDTO> boardDetail(int board_seq) {
        return mybatis.selectList("report.boardDetail", board_seq);
    }

    public List<CommentDTO> commentList() {
        return mybatis.selectList("report.commentList");
    }

    public List<ReportDTO> commentDetail(int comment_seq) {
        return mybatis.selectList("report.commentDetail", comment_seq);
    }

    public List<ReportCountDTO> boardReportList() {
        return mybatis.selectList("report.boardReportList");
    }

    public List<ReportCountDTO> commentReportList() {
        return mybatis.selectList("report.commentReportList");
    }
}
