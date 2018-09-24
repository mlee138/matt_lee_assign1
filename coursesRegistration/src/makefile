JCC = javac
JFLAGS = -g

.SUFFIXES: .java .class

default: Driver.class

Driver.class: Driver.java
		$(JCC) $(JFLAGS) Driver.java

clean:
	$(RM) *.class