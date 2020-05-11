package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.ImageDto;
import util.DbConnection;

public class ImageDao {
private final String GET_DATA = "select id,name from imageupload";
private final String GET_IMAGE_QUERY = "select image from imageupload where id=?";
Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;

public List<ImageDto> getData(){
	ImageDto imageDto = null;
	List<ImageDto> imageList = new ArrayList<ImageDto>();
	try {
		con = DbConnection.getConnection();
		ps = con.prepareStatement(GET_DATA);
		rs = ps.executeQuery();
		while(rs.next()) {
			imageDto = new ImageDto();
			imageDto.setId(rs.getString(1));
			imageDto.setName(rs.getString(2));
			imageList.add(imageDto);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return imageList;
}

public byte[] getImage(String id){
	byte[] image = null;
	try {
	con = DbConnection.getConnection();
	ps = con.prepareStatement(GET_IMAGE_QUERY);
	ps.setString(1, id);
	rs = ps.executeQuery();
	if(rs.next()) {
	image = rs.getBytes(1);
	}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return image;
}
}












