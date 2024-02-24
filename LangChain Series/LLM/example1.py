import os 
from constants import openai_key
from langchain.llms.openai import OpenAI
import streamlit as st
from langchain_core.prompts import PromptTemplate
from langchain.chains import LLMChain



#streamlit framework
st.title ("Celebrity search results")
input_text = st.text_input("search the topic you want")

os.environ["OPENAI_API_KEY"] = openai_key

#Prompt templates
first_input_prompt = PromptTemplate(
    input_variables=['name'],
    template= "Tell me aboout calebrity {name}"
    
)

#Initialize openai llms
llm = OpenAI(temperature=0.8)
chain = LLMChain(llm=llm, prompt= first_input_prompt, verbose=True)



if input_text:
    st.write(chain.run(input_text))
