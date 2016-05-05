package uz.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Create_PPZ_200_Special.class,
	Approval_PPZ.class,
	CheckAndRemoveExistPZ.class,
	Create_PZ.class,
	Approval_PZ.class,
	Create_PPG_Special.class,
	Approval_PPG.class,
	CheckAndRemoveExistPG.class, 
	Create_PG.class, 
	Approval_PG.class
	})
public class TestCaseSuitSpecial {

}
