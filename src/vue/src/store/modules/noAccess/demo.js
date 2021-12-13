import axios from "axios"

const demo = {
  namespaced: true,
  state: {
    codeText: `public class Main {
      public static void main(String[] args) {
  System.out.println("hello java");
      }
  }`,
    resultCode: ""
  },
  mutations: {
    setCodeText(state, code) {
      state.codeText = code
    },
    setResultCode(state, code) {
      state.resultCode = code
    }
  },
  actions: {
    runCompile(context) {
      const params = new URLSearchParams()
      params.append('code', context.state.codeText)

      axios.post("/noAccess/demoCompile", params)
        .then(res => {
          console.log(res.data)
          context.commit("setResultCode", res.data)
        })
    }
  }
}

export default demo