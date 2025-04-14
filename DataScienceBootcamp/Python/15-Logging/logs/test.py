from custom_logger import logging

def add(a,b):
    logging.debug("addition operation is takig place");
    return (a+b);


logging.debug("Addition function is called");
sum= add(1,2);
print("sum is :", sum)