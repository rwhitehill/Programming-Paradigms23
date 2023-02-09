#include <iostream>
#include <vector>
#include <memory>

class Widget {
public:
    Widget() = default;
    virtual ~Widget() {
        std::cout << "Destructing a Widget" << std::endl;
    }

    virtual void draw() const {
        std::cout << "Drawing a Widget" << std::endl; 
    }
};

class TextBox : public Widget {
public:
    TextBox() = default;
    ~TextBox() override {
        std::cout << "Destructing a TextBox" << std::endl;
    }

    void draw() const override {
        std::cout << "Drawing a Text Box" << std::endl;
    };
};

class CheckBox : public Widget {
public:
    CheckBox() = default;
    ~CheckBox() override {
        std::cout << "Destructing a CheckBox" << std::endl;
    }

    void draw() const override {
        std::cout << "Drawing a Check Box" << std::endl;
    }
};


int main() {

    // std::vector<Widget> widgets;
    // widgets.push_back(TextBox {});
    // widgets.push_back(CheckBox {});
    
    // for (auto widget : widgets) {
    //     widget.draw();
    // }

    // std::cout << std::endl;

    // std::vector<Widget*> widget_vec;
    // widget_vec.push_back(new TextBox);
    // widget_vec.push_back(new CheckBox);

    // for (auto widget : widget_vec) {
    //     widget->draw();
    // }
    
    std::vector<std::unique_ptr<Widget>> smart_widgets;
    smart_widgets.push_back(std::make_unique<TextBox>());
    smart_widgets.push_back(std::make_unique<CheckBox>());

    return 0;
}
