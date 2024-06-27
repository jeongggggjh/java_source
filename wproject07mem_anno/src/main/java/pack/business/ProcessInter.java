package pack.business;

import java.util.List;

public interface ProcessInter {
	List<DataDto> selectDataAll();
	DataDto selectDataPart(String para);
	boolean insertData(DataFormBean form);
	boolean updateData(DataFormBean form);
	boolean deleteData(String id);
}
