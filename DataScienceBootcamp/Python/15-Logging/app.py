import logging 

#logging settings
for handler in logging.root.handlers[:]:
    logging.root.removeHandler(handler)

logging.basicConfig(
    level=logging.DEBUG,
    format='%(asctime)s - %(name)s - %(levelname)s - %(message)s',
    datefmt="%Y-%m-%d %H:%M:%S",
    handlers=[
        logging.FileHandler("app1.log"),
        logging.StreamHandler()
    ]
)


logger1 =logging.getLogger("ArithematicOperationsApp")



def addition(a,b):

    result = a+b;
    logger1.debug(f"Addition {a} + {b} = {result}")
    return (result);

def subtraction(a,b):
    result = a-b;
    logger1.debug(f"Subtraction {a} - {b} = {result}")
    return result;

def division(a,b):
    try:
        result = a%b;
        logger1.debug(f"Division {a} % {b} = {result}")
        return (result);
    except Exception:
        logger1.error("Division by zero error");
        return None;




addition(2,3);
subtraction(2,3);
division(2,0);




