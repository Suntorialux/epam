package by.gsu.epamlab;

import java.sql.Date;

public class HalfResultFactory extends ResultFactory {

		
	@Override
	public Result getResultFromFactory(String login, String test, Date date, String stringMark) {
		// TODO Auto-generated method stub
		int mark = (int)Double.parseDouble(stringMark)*2;
		return new HalfResult(login, test, date, mark);
	}

	@Override
	public Result getResultFromFactory(String login, String test, Date date, int mark) {
		// TODO Auto-generated method stub
		return new HalfResult(login, test, date, mark);
	}
	
	

}
