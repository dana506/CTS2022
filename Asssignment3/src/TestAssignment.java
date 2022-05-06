import dana.buzatu.as.composite.*;
import dana.buzatu.as.decorator.*;
import dana.buzatu.as.prototype.*;
import dana.buzatu.as.registry.*;
import dana.buzatu.as.singleton.*;

public class TestAssignment {
	TestComposite composite;
	TestDecorator decorator;
	TestPrototype prototype;
	TestRegistry registry;
	TestSingleton singleton;

	public TestAssignment(TestComposite composite, TestDecorator decorator, TestPrototype prototype,
			TestRegistry registry, TestSingleton singleton) {

		this.composite = composite;
		this.decorator = decorator;
		this.prototype = prototype;
		this.registry = registry;
		this.singleton = singleton;
	}

}