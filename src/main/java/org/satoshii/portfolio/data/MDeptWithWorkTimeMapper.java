package org.satoshii.portfolio.data;

import org.satoshii.portfolio.bean.*;
import org.apache.ibatis.annotations.Select;
import java.util.*;

public interface MDeptWithWorkTimeMapper {
    @Select("SELECT * FROM m_dept")
    List<MDeptWithWorkTime> selectMDeptWithWorkTimes();
}
