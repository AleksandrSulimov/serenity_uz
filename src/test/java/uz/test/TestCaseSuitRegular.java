package uz.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CheckAndRemoveExistPZ.class,
	CheckAndRemoveExistPG.class, 
	Create_PPZ_200_Regular.class,
	Approval_PPZ.class,
	Create_PZ.class,
	Approval_PZ.class,
	Create_PPG_Regular.class,
	Approval_PPG.class,
	Create_PG.class, 
	Approval_PG.class
	})
public class TestCaseSuitRegular {

}
