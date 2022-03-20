package stack.maxstack;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

class MaxStackTest {

	@Test
	void case1() {
		MaxStack stack = new MaxStack();
		stack.push(5);
		stack.push(1);
		stack.push(5);

		assertAll(() -> {
			assertThat(stack.top()).isEqualTo(5);
			assertThat(stack.popMax()).isEqualTo(5);
			assertThat(stack.top()).isEqualTo(1);
			assertThat(stack.peekMax()).isEqualTo(5);
			assertThat(stack.pop()).isEqualTo(1);
			assertThat(stack.top()).isEqualTo(5);
		});
	}

}