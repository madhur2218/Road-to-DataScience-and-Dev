import os 
from constants import openai_key
from langchain.llms.openai import OpenAI
import streamlit as st
from langchain_core.prompts import PromptTemplate
from langchain.chains import LLMChain
from langchain.chains import SimpleSequentialChain
from langchain.chains import SequentialChain
from langchain.memory import  ConversationBufferMemory



#streamlit framework
st.title ("Celebrity search results")
input_text = st.text_input("search the topic you want")

os.environ["OPENAI_API_KEY"] = openai_key

#First Prompt templates
first_input_prompt = PromptTemplate(
    input_variables=['name'],
    template= "Tell me aboout calebrity {name}"
    
)

#Memory
person_memory = ConversationBufferMemory(input_key='name' , memory_key='chat_history')
dob_memory = ConversationBufferMemory(input_key='person' , memory_key='chat_history')
desc_memory = ConversationBufferMemory(input_key='dob' , memory_key='description_history')


#Initialize openai llms
llm = OpenAI(temperature=0.8)
chain1 = LLMChain(llm=llm, prompt= first_input_prompt, verbose=True, output_key='person', memory=person_memory)


#Second Prompt templates
second_input_prompt = PromptTemplate(
    input_variables=['person'],
    template= "tell me when was {person} born"
    
)

chain2 = LLMChain(llm=llm, prompt= second_input_prompt, verbose=True, output_key='dob',memory=dob_memory)

# Third Prompt templates
third_input_prompt = PromptTemplate(
    input_variables=['dob'],
    template= "tell me 5 major events that happened around {dob} in the world"
    
)

chain3 = LLMChain(llm=llm, prompt= third_input_prompt, verbose=True, output_key='description', memory=desc_memory)

parent_chain= SequentialChain(chains=[chain1,chain2,chain3], input_variables =['name'], output_variables = ['person', 'dob','description'], verbose=True)


if input_text:
    st.write(parent_chain.run({'name' :input_text }))

    with st.expander('Person Name'):
        st.info(person_memory.buffer)
    
    with st.expander('Major events'):
        st.info(desc_memory.buffer)

