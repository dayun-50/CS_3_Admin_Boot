package admin.dash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.report.ReportDAO;
import admin.user.UserDAO;

@Service
public class DashService {
    @Autowired
    private DashDAO dao;

    @Autowired
    private ReportDAO reportdao;

    @Autowired
    private UserDAO userdao;

    public List<DashChartDTO> pathList() {
        return dao.pathList();
    }

    public List<ReportCountDTO> boardReportList() {
        return reportdao.boardReportList();
    }

    public List<ReportCountDTO> commentReportList() {
        return reportdao.commentReportList();
    }

    public List<ReportCountDTO> ageGroup() {
        return userdao.ageGroup();
    }
}
