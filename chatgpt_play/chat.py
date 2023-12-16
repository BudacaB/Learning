from openai import OpenAI
# import tiktoken
from dotenv import load_dotenv

load_dotenv()


class ChatGPT:

    def __init__(self):
        self.client = OpenAI()  # Initialize the OpenAI client

    def get_completion_and_token_count(self,
                                       messages,
                                       model="gpt-3.5-turbo",
                                       temperature=0,
                                       max_tokens=500):
        response = self.client.chat.completions.create(model=model,
                                                  messages=messages,
                                                  temperature=temperature,
                                                  max_tokens=max_tokens)

        token_dict = {
            'prompt_tokens': response.usage.prompt_tokens,
            'completion_tokens': response.usage.completion_tokens,
            'total_tokens': response.usage.total_tokens,
        }

        return response.choices[0].message, token_dict

    def get_moderation_check(self, message):
        response = self.client.moderations.create(input=message)

        return response.results

