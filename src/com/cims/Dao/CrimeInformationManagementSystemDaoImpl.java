package com.cims.Dao;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.sql.Date;
import java.time.LocalDate;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.cims.bean.Crime_files;
import com.cims.bean.Criminal;
import com.cims.utility.CimsUtility;
import com.cimsExceptions.CrimeSystemException;

public class CrimeInformationManagementSystemDaoImpl implements CrimeInformationManagementSystemDao {

	private Object Criminal;

	@Override
	public String registerCriminal(Criminal c) {

		String msg = "Not registerCriminal";

		try (Connection con = CimsUtility.proviedConnection()) {

			PreparedStatement ps = con.prepareStatement(
					"insert into criminal (criname,age,gender,address,imark,area_of,pincode,case_Id) values(?,?,?,?,?,?,?,?)");

			ps.setString(1, c.getCri_name());
			ps.setInt(2, c.getAge());
			ps.setString(3, c.getGender());
			ps.setString(4, c.getAddress());
			ps.setString(5, c.getIdentification());
			ps.setString(6, c.getArea_of_crime());
			ps.setInt(7, c.getArea_pincode());
			ps.setInt(8, c.getCrime_file());
			int x = ps.executeUpdate();

			if (x > 0)
				msg = "Criminal registered sucessfully ..";

		} catch (SQLException e) {

			msg = e.getMessage();

		}

		return msg;
	}

	@Override
	public String registerCrimeFile(Crime_files c) {

		String msg = "Not registerCrimeFile";

		try (Connection con = CimsUtility.proviedConnection()) {
			PreparedStatement ps = con.prepareStatement(
					"insert into crime_file (dt,cname,victims,msuspected,status,des_ofcrime,area_of_crime,pincode ) values(?,?,?,?,?,?,?,?)");

			ps.setString(1, c.getDate());
			ps.setString(2, c.getCname());
			ps.setString(3, c.getVictims());

			ps.setString(4, c.getMain_suspect());
			ps.setString(5, c.getStatus());
			ps.setString(6, c.getDetails_of_crime());
			ps.setString(7, c.getAre_of_crime());
			ps.setInt(8, c.getPincode());
			int x = ps.executeUpdate();
//			ps.setString(1, msg);

			if (x > 0)
				msg = "CrimeFile registered sucessfully ..";

		} catch (SQLException e) {

			msg = e.getMessage();

		}

		return msg;
	}

	@Override
	public Criminal searchbyCriminalID(int id) throws CrimeSystemException {
		// TODO Auto-generated method stub

		Criminal cs = null;

		try (Connection con = CimsUtility.proviedConnection()) {

			PreparedStatement pp = con.prepareStatement("select * from criminal where crim_id=?");

			pp.setInt(1, id);

			ResultSet set = pp.executeQuery();

			if (set.next())
				cs = new Criminal(set.getInt("Crim_id"), set.getString("criname"), set.getInt("age"),
						set.getString("gender"), set.getString("address"), set.getString("imark"),
						set.getString("area_of"), set.getInt("case_Id"), set.getInt("pincode"));
			else

				throw new CrimeSystemException(id + "!-!  This Criminal Id Doesn't Exits ");

		} catch (SQLException e) {
			// TODO: handle exception

			throw new CrimeSystemException(e.getMessage());
		}

		return cs;
	}

	@Override
	public List<Criminal> searchbyCriminalName(String name) throws CrimeSystemException {
		// TODO Auto-generated method stub

		List<Criminal> rec = new ArrayList<Criminal>();
		Criminal cs = null;

		try (Connection con = CimsUtility.proviedConnection()) {

			PreparedStatement pp = con.prepareStatement("select * from criminal where criname=?");

			pp.setString(1, name);

			ResultSet set = pp.executeQuery();

			while (set.next()) {
				cs = new Criminal(set.getInt("Crim_id"), set.getString("criname"), set.getInt("age"),
						set.getString("gender"), set.getString("address"), set.getString("imark"),
						set.getString("area_of"), set.getInt("case_Id"), set.getInt("pincode"));
				rec.add(cs);
			}

			if (rec.isEmpty())

				throw new CrimeSystemException(name + " !-! This Criminal name Doesn't Exits ");

		} catch (SQLException e) {
			// TODO: handle exception

			throw new CrimeSystemException(e.getMessage());
		}

		return rec;
	}

	@Override
	public Crime_files searchbyCrimesbyID(int id) throws CrimeSystemException {
		Crime_files cs = null;

		try (Connection con = CimsUtility.proviedConnection()) {

			PreparedStatement pp = con.prepareStatement("select * from crime_file where case_no=?");

			pp.setInt(1, id);

			ResultSet set = pp.executeQuery();

			if (set.next())

				cs = new Crime_files(set.getInt("Case_no"), set.getString("dt"), set.getString("victims"),
						set.getString("des_ofcrime"), set.getString("msuspected"), set.getString("cname"),
						set.getString("area_of_crime"), set.getInt("pincode"), set.getString("status"));

			else

				throw new CrimeSystemException(id + "!-!  This Case-no Doesn't Exits ");

		} catch (SQLException e) {
			// TODO: handle exception

			throw new CrimeSystemException(e.getMessage());
		}

		return cs;
	}

	@Override
	public List<Crime_files> searchbyCrimesName(String name) throws CrimeSystemException {

		List<Crime_files> rec = new ArrayList<Crime_files>();
		Crime_files cs = null;

		try (Connection con = CimsUtility.proviedConnection()) {

			PreparedStatement pp = con.prepareStatement("select * from crime_file where cname=?");

			pp.setString(1, name);

			ResultSet set = pp.executeQuery();

			while (set.next()) {
				cs = new Crime_files(set.getInt("Case_no"), set.getString("dt"), set.getString("victims"),
						set.getString("des_ofcrime"), set.getString("msuspected"), set.getString("cname"),
						set.getString("area_of_crime"), set.getInt("pincode"), set.getString("status"));

				rec.add(cs);
			}

			if (rec.isEmpty())

				throw new CrimeSystemException(name + " !-! This Crime record Doesn't Exits in this database ");

		} catch (SQLException e) {
			// TODO: handle exception

			throw new CrimeSystemException(e.getMessage());
		}

		return rec;
	}

	@Override
	public String CrimebychangeStatus(int id, String value) throws CrimeSystemException {
		// TODO Auto-generated method stub

		String msg = null;

		try (Connection con = CimsUtility.proviedConnection()) {

			PreparedStatement pp = con.prepareStatement("	update crime_file set status = ? where case_no=?");
			;
			pp.setString(1, value);
			pp.setInt(2, id);

			int set = pp.executeUpdate();
			if (set > 0)
				msg = "Status will be changed - " + value + "To this case_fileno :)- " + id;

			else
				throw new CrimeSystemException(id + " !-! This Crime record Doesn't Exits");
			// in this database ");

		} catch (SQLException e) {
			// TODO: handle exception

			throw new CrimeSystemException(e.getMessage());
		}

		return msg;

	}

	@Override
	public int NumberofCaseSolved() throws CrimeSystemException {
		int msg = 0;

		try (Connection con = CimsUtility.proviedConnection()) {

			PreparedStatement pp = con.prepareStatement(" select * from crime_file  where status = 'Solved'");
			;

			ResultSet set = pp.executeQuery();
			while (set.next()) {
				msg += 1;

			}

		} catch (SQLException e) {
			// TODO: handle exception

			throw new CrimeSystemException(e.getMessage());
		}

		return msg;
	}

	@Override
	public int NumberofCaseUnSolved() throws CrimeSystemException {
		int msg = 0;

		try (Connection con = CimsUtility.proviedConnection()) {

			PreparedStatement pp = con.prepareStatement(" select * from crime_file  where status = 'Unsolved'");
			;

			ResultSet set = pp.executeQuery();
			while (set.next()) {
				msg += 1;

			}

		} catch (SQLException e) {
			// TODO: handle exception

			throw new CrimeSystemException(e.getMessage());
		}

		return msg;
	}

	@Override
	public int NumberofCrimeCurrentMonth() throws CrimeSystemException {
		int count = 0;
		LocalDate currentdate = LocalDate.now();
//		int currentDay = currentdate.getDayOfMonth();

		Month currentMonth = currentdate.getMonth();

		try (Connection con = CimsUtility.proviedConnection()) {

			PreparedStatement pp = con.prepareStatement("select  * from crime_file where Month(dt) =Month(?)");
			;
			Date sqlDate = Date.valueOf(currentdate);

			pp.setDate(1, sqlDate);
			ResultSet set = pp.executeQuery();
			while (set.next()) {
				count += 1;

			}

		} catch (SQLException e) {
			// TODO: handle exception

			throw new CrimeSystemException(e.getMessage());
		}

		return count;
	}

	@Override
	public List<Crime_files> displaycrimebyArea(String area, int pin) throws CrimeSystemException {
		// TODO Auto-generated method stub

		List<Crime_files> rec = new ArrayList<>();

		Crime_files obj = null;

		try (Connection con = CimsUtility.proviedConnection()) {

			PreparedStatement pp = con
					.prepareStatement(" select  * from crime_file where area_of_crime = ? AND pincode = ?");

			pp.setString(1, area);
			pp.setInt(2, pin);
			ResultSet set = pp.executeQuery();
			while (set.next()) {

				obj = new Crime_files();

				obj.setAre_of_crime(set.getString("area_of_crime"));
				obj.setCase_no(set.getInt("Case_no"));
				obj.setCname(set.getString("cname"));
				obj.setDate(set.getString("dt"));
				obj.setDetails_of_crime(set.getString("des_ofcrime"));
				obj.setMain_suspect(set.getString("msuspected"));
				obj.setPincode(set.getInt("pincode"));
				obj.setStatus(set.getString("status"));
				obj.setVictims(set.getString("victims"));
				rec.add(obj);

			}

			if (rec.isEmpty())
				throw new CrimeSystemException(area + " !-! This area  Doesn't Exits");

		} catch (SQLException e) {
			// TODO: handle exception

			throw new CrimeSystemException(e.getMessage());
		}

		return rec;
	}

	@Override
	public List<com.cims.bean.Criminal> displaycriminalbyArea(String area, int pin) throws CrimeSystemException {
		List<Criminal> rec = new ArrayList<>();

		Criminal obj = null;

		try (Connection con = CimsUtility.proviedConnection()) {

			PreparedStatement pp = con.prepareStatement(" select  * from criminal where area_of = ? AND pincode = ?");

			pp.setString(1, area);
			pp.setInt(2, pin);
			ResultSet set = pp.executeQuery();
			while (set.next()) {
				obj = new Criminal(set.getInt("Crim_id"), set.getString("criname"), set.getInt("age"),
						set.getString("gender"), set.getString("address"), set.getString("imark"),
						set.getString("area_of"), set.getInt("case_Id"), set.getInt("pincode"));
				rec.add(obj);

			}

			if (rec.isEmpty())
				throw new CrimeSystemException(area + " !-! This area  Doesn't Exits");

		} catch (SQLException e) {
			// TODO: handle exception

			throw new CrimeSystemException(e.getMessage());
		}

		return rec;
	}

}
