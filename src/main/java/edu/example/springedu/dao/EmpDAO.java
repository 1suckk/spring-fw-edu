package edu.example.springedu.dao;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import edu.example.springedu.domain.EmpDTO;
import edu.example.springedu.domain.PageDTO;
@Mapper
public interface EmpDAO {
    public int getAllDataNum();

    public List<EmpDTO> listAll();

    public EmpDTO findByNo(int no);
 
    public List<EmpDTO> findByName(String name);

    public EmpDTO findByNumAndJob(HashMap<String, Object> map);
    
    public List<EmpDTO> listAllOrderBySalAsc();    
    
    public List<EmpDTO> findByNameStart(String partName);
    
    public List<EmpDTO> listAllOrderBySalDesc();
   
    public List<EmpDTO> listPart(PageDTO vo);
}