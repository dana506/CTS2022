package dana.buzatu.as.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import dana.buzatu.as.tests.categories.*;

@RunWith(Categories.class)
@IncludeCategory({ImportantTest.class, PerformanceTest.class})
//@ExcludeCategory({ImportantTest.class, PerformanceTest.class})
@SuiteClasses({ TestCaseReq1.class, TestCaseReq2.class, TestCaseReq3.class  })
public class AllImportantTests {

}