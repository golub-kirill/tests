class Clock {

	int hours = 12;
	int minutes = 0;

	void next() {
		// implement me
		if (minutes < 59) {
			minutes++;
		} else if (minutes == 59) {
			minutes = 0;
			if (hours < 12) {
				hours++;
			} else {
				hours = 1;
			}
		}
	}
}