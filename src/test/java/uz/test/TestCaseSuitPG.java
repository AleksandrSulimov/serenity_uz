package uz.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CheckAndRemoveExistPG.class, Create_PG.class, Approval_PG.class, Autoprocedure_RemoveDocument_PG.class
	})
public class TestCaseSuitPG {

}
