package dana.buzatu.as.registry;

import dana.buzatu.as.registry.*;

public class TestRegistry {

	public static void main(String[] args) throws CloneNotSupportedException {

		RegistryLogBook registryLogBook1 = RegistryLogBook.getInstancesLoggers("file1");
		RegistryLogBook registryLogBook2 = RegistryLogBook.getInstancesLoggers("file2");
		RegistryLogBook registryLogBook3 = RegistryLogBook.getInstancesLoggers("file3");

		if (registryLogBook1 == registryLogBook3) {
			System.out.println("They are the same object");
		} else {
			System.out.println("They are different");
		}

		if (registryLogBook1 == registryLogBook2) {
			System.out.println("They are the same object");
		} else {
			System.out.println("They are different");
		}

	}
}