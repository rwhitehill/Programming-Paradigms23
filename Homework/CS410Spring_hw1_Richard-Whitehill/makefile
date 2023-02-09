JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $*.java

CLASSES = \
		  Console.java \
		  Mortgage.java \
		  Mortgage_Report.java \
		  Mortgage_Calculator.java \
		  Main.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
