package fits.hadoop.piglatin;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

public class DateFormatter extends EvalFunc<String> {

	protected static final Logger logger = Logger.getLogger(DateFormatter.class);

	@Override
	public String exec(Tuple tuple) throws IOException {
		String originalDate = tuple.get(0).toString();
		logger.info("Executing EvelFunc [tuple: " + tuple + ", originalDate: " + originalDate + "]");
		return "NewDate_" + originalDate;
	}
}
