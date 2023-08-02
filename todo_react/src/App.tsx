import { useEffect, useState } from "react";
import "./App.css";
import axios from "axios";
import { useForm } from "react-hook-form";

function App() {
  const { register, handleSubmit } = useForm<{ todo: string }>();

  useEffect(() => {
    axios.get("http://localhost:8081").then((response) => {
      console.log(response);
    });
  }, []);

  const addTodo = (event: { todo: string }) => {
    console.log(event);
    const { todo } = event;
    console.log(todo);

    axios
      .post("http://localhost:8081/add", {
        todo,
      })
      .then((response) => {
        console.log(response);
      });
  };

  return (
    <div>
      <form onSubmit={handleSubmit(addTodo)}>
        <input {...register("todo")} type="text" />
        <button>add</button>
      </form>
    </div>
  );
}

export default App;
