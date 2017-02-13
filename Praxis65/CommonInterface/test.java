public void foo(MutablePinNumbers p)
{}
public void bar(ImmutablePinNumbers p)
{}
MutablePinNumbers m = new MutablePinNumbers("person1", 101,
                                            201);
ImmutablePinNumbers im = new ImmutablePinNumbers("person2", 102,
                                                  202);
foo((MutablePinNumbers)im);   //Compiler error
bar((ImmutablePinNumbers)m);  //Compiler error